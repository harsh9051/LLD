package DesignPatterns.CreationalDesignPattern.PrototypeDesignPatter;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadImportantData() throws InterruptedException {
        this.data = "VeryImportantData";
        this.domains.add("www.google.com");
        this.domains.add("www.youtube.com");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /*
        This will implement Shallow copy
         */
//        return super.clone();

        /*
        This will implement Deep Copy
        We have to set individual data members here.
         */

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());
        for(String d : this.getDomains())
            networkConnection.getDomains().add(d);

        return networkConnection;
    }

}
