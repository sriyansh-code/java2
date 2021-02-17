class Customer{
    static void placeorder(String name,double cash){}
    static boolean getorderstatus(String orderid){}
    static boolean finish(int orderid){}
}

class cashier{
    static boolean confirmorder(String name, double cash){}
    static int generateorder(String name){}
    static void addtoorderlist (int orderid){}
}

class Barista{
    static void getorder(int orderid){}
    static int orderdone(int orderid){}
    static boolean notificutomer(int orderid){}
}