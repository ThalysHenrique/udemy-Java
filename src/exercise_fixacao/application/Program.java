package exercise_fixacao.application;

import exercise_fixacao.entities.ImportedProduct;
import exercise_fixacao.entities.Product;
import exercise_fixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.println("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            if(ch == 'c'){
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.println("Manufacture date (MM/DD/YYYY): ");
                Date date1 = date.parse(sc.next());
                list.add(new UsedProduct(name, price, date1));
            } else {
                System.out.println("Customs Fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("Price Tags: ");

        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
