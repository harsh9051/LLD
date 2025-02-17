package RealWorldProblems.LibraryManagementSystem.model;

import RealWorldProblems.LibraryManagementSystem.Enum.AccountStatus;
import RealWorldProblems.LibraryManagementSystem.model.Abstract.Person;
import RealWorldProblems.LibraryManagementSystem.model.Abstract.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Librarian extends User {

    private int bookIndex;
    private int memberIndex;
    private final List<BookItem> bookItemList;
    private final List<Member> memberList;
    private final HashMap<Member, Integer> memberIntegerHashMap;
    private final HashMap<BookItem, Integer> bookItemIntegerHashMap;

    public Librarian(String id, String password, AccountStatus status, Person person) {
        super(id, password, status, person);
        this.bookItemList = new ArrayList<>();
        this.memberList = new ArrayList<>();
        this.bookItemIntegerHashMap = new HashMap<>();
        this.bookIndex = 0;
        this.memberIndex = 0;
        this.memberIntegerHashMap = new HashMap<>();
    }

    public void addBooks(BookItem bookItem){
        bookItemIntegerHashMap.put(bookItem, this.bookIndex);
        this.bookItemList.add(bookItem);
        this.bookIndex++;
    }

    public void removeBooks(BookItem bookItem){
        /*
        We will remove the particular bookItem in O(1) using hashmap which keeps
        the track of position of particular book.
         */

        int value = bookItemIntegerHashMap.get(bookItem);
        if(value == bookItemList.size()-1){
            bookItemList.removeLast();
            bookItemIntegerHashMap.remove(bookItem);
        }else{
            BookItem lastBookItem = bookItemList.getLast();
            int lastposition = bookItemIntegerHashMap.get(lastBookItem);
            bookItemList.set(lastposition, bookItem);
            bookItemList.set(value, lastBookItem);
            this.bookItemList.removeLast();
            bookItemIntegerHashMap.put(lastBookItem, value);
        }
        this.bookIndex--;
    }

    public void addMembers(Member member){
        memberIntegerHashMap.put(member, this.memberIndex);
        this.memberList.add(member);
        this.memberIndex++;
    }

}
