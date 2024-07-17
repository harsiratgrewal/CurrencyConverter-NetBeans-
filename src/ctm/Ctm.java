package ctm;
public class Ctm {
    static String convCurr = "USD";
    static double excRate, initialAmount, usdAmount, fees, total, cashIns, cashRet;
    private static long cardNum;
    private static int expMonth, expYear, cvv, tranID;
    static String curr, payMeth;
    private static String passFName, passLName, passID, debFName, debLName, addl1, addl2, city, state, zip;
    public static selectionFrame selection = new selectionFrame();
    public static conversionFrame conversion = new conversionFrame();
    public static scanFrame scan = new scanFrame();
    public static amountFrame amount = new amountFrame();
    public static cashPayFrame cashPay = new cashPayFrame();
    public static debitPayFrame debitPay = new debitPayFrame();
    public static transSumFrame transSum = new transSumFrame();
    public static thankFrame thank = new thankFrame();
    public static String getpassFName() {
    return passFName;
    }
    public static void setpassFName(String FName) {
    passFName = FName;
    }
    public static String getpassLName() {
    return passLName;
    }
    public static void setpassLName(String LName) {
    passLName = LName;
    }
    public static String getpassID() {
    return passID;
    }
    public static void setpassID(String ID) {
    passID = ID;
    }
    public static long getcardNum() {
    return cardNum;
    }
    public static void setcardNum(long cardNu) {
    cardNu = cardNum;
    }
    public static int getexpMonth() {
    return expMonth;
    }
    public static void setexpMonth(int exp) {
    exp = expMonth;
    }
    public static int getexpYear() {
    return expYear;
    }
    public static void setexpYear(int exp) {
    exp = expYear;
    }
    public static int getcvv() {
    return cvv;
    }
    public static void setcvv(int cardNu) {
    cardNu = cvv;
    }
    public static int gettranID() {
    return tranID;
    }
    public static void settranID(int cardNu) {
    cardNu = tranID;
    }
    public static String getdebFName() {
    return passFName;
    }
    public static void setdebFName(String FName) {
    passFName = FName;
    }
    public static String getdebLName() {
    return passFName;
    }
    public static void setdebLName(String FName) {
    passFName = FName;
    }
    public static String getaddl1() {
    return passFName;
    }
    public static void setaddl1(String FName) {
    passFName = FName;
    }
    public static String getaddl2() {
    return passFName;
    }
    public static void setaddl2(String FName) {
    passFName = FName;
    }
    public static String getcity() {
    return passFName;
    }
    public static void setcity(String FName) {
    passFName = FName;
    }
    public static String getstate() {
    return passFName;
    }
    public static void setstate(String FName) {
    passFName = FName;
    }
    public static String getzip() {
    return passFName;
    }
    public static void setzip(String FName) {
    passFName = FName;
    }
    public static void main(String[] args) {
        selection.setVisible(true);
    }
}
