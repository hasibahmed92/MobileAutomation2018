package dataBase;

import Util.ConnectToMongoDB;
import Util.Product;
import com.mongodb.client.MongoDatabase;
import common.Base;

import java.util.ArrayList;
import java.util.List;

import static Util.ConnectToMongoDB.connectToMongoDB;

public class MongoDBConnection extends Base {
    public static ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        MongoDatabase mongoDatabase = connectToMongoDB();
        connectToMongoDB.insertStringIntoMongoDB("news");
    }
    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<String>();
        headerList.add("News");
        headerList.add("Metro");
        headerList.add("Page Six");
        headerList.add("Sports");
        headerList.add("Business");
        headerList.add("Opinion");
        return headerList;
    }
    public List<Product> getUserDatafromDB() throws Exception {
        List<Product> list= new ArrayList<Product>();
        list = connectToMongoDB.readStudentListFromMongoDB("news");
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) throws Exception {
        insertIntoToMongoDB("news");
        MongoDatabase mongoDatabase = connectToMongoDB();
        List<Product> list = connectToMongoDB.readStudentListFromMongoDB("news");
        for (Product st : list) {
            System.out.println(st);
        }
    }

    private static void insertIntoToMongoDB(String news) {
    }
}
