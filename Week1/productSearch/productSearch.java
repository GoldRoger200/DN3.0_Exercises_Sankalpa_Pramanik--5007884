import java.util.*;
class Product{
    private int id;
    private String name;
    private String category;
    public Product(int id,String name,String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }
    public int getProductId(){
        return id;
    }
    public String getProductName(){
        return name;
    }
    public String getCategory(){
        return category;
    }

    @Override
    public String toString(){
        return "Product{" +
        "productId=" + id +
        ", productName='" + name + '\'' +
        ", category='" + category + '\'' +
        '}';
    }
}
class Linearsearch{
    public static Product linearSearch (Product[] products,int targetID){
        for(Product p : products){
            if(p.getProductId()==targetID){
                return p;
            }
        }
        return null;
    }
}
class BinarySearch{
    public static Product binarysearch(Product[] products, int targetID){
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));
        int low = 0;
        int high = products.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(products[mid].getProductId() == targetID) return products[mid];
            else if(products[mid].getProductId() >targetID) high = mid -1;
            else low = mid+1;
        }
        return null;
    }
}
public class productSearch {
    public static void main(String[] args){

    Product[] products={
        new Product(1,"Laptop", "Electronics"),
        new Product(2,"Smartphone", "Electronics"),
        new Product(3,"Book", "Education"),
        new Product(4,"Shirt", "Clothing"),
        new Product(5,"Shoes", "Footwear"),
    };
    Scanner sc = new Scanner(System.in);
    int targetID =sc.nextInt();
    Product found = BinarySearch.binarysearch(products, targetID);
    System.out.println("By Binary Search");
    System.out.println(found);
    Product found2 = Linearsearch.linearSearch(products, targetID);
    System.out.println("By Linear Search");
    System.out.println(found2);
    sc.close();
    }
}
