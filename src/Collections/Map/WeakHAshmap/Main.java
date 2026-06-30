package Collections.Map.WeakHAshmap;

import java.lang.ref.WeakReference;

public class Main {
    static void main(String[] args) {
        Phone phone = new Phone("Samsung" , "A35");
        WeakReference<Phone> weakphone = new WeakReference<>(new Phone("Iphone","!6 pro max"));
        System.out.println(phone);
        System.out.println(weakphone.get());
        System.gc();
        System.out.println(weakphone.get()); //null
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println("thank you");
        }
        System.out.println(weakphone.get());






    }
}













class Phone{
     private String Brand;
    private String Model;

    public Phone(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
