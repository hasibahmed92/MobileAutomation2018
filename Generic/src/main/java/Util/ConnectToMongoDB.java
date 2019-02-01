package Util;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class ConnectToMongoDB {
    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB() {
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("PNT");
        System.out.println("Database Connected");

        return mongoDatabase;
    }

    public static String insertIntoToMongoDB(Product product) {
        String profile = product.getProduct();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        Document document = new Document().append("product", product.getProduct());
        collection.insertOne(document);
        return profile + " has been delivered";
    }

    public String insertIntoMongoDB(List<Product> product, String profileName) {
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection myCollection = mongoDatabase.getCollection(profileName);
        boolean collectionExists = mongoDatabase.listCollectionNames()
                .into(new ArrayList<String>()).contains(profileName);
        if (collectionExists) {
            myCollection.drop();
        }
        for (int i = 0; i < product.size(); i++) {
            MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
            Document document = new Document().append("product", product.get(i).getProduct());
            collection.insertOne(document);
        }
        return "Product is here";
    }
    public void insertStringIntoMongoDB(List<String> list) {
        String profile = list.toString();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        Document document = new Document().append("product", list.toString());
        collection.insertOne(document);

    }
    public static List<Product> readUserProfileFromMongoDB() {
        List<Product> list = new ArrayList<Product>();
       Product product = new Product();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc : iterable) {
            String product1 = (String) doc.get("product");
           product.setProduct("news");
            product= new Product(product1);
            list.add(product);
        }
        return list;
    }

    public List<Product> readStudentListFromMongoDB(String profileName) {
        List<Product> list = new ArrayList<Product>();
        Product product = new Product();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc : iterable) {
            String product1 = (String) doc.get("news");
            product.setProduct(product1);

            product = new Product(product.getProduct());
            list.add(product);
        }
return list;
    }

    public static void main(String[] args) {
        insertIntoToMongoDB(new Product("news"));
        List<Product> product = readUserProfileFromMongoDB();
        for (Product person : product) {
            System.out.println(person.getProduct());
        }
    }


    public void insertStringIntoMongoDB(String news) {
    }
}