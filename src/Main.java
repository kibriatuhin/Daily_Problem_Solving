public class Main {
    public  String formatToMonYear(String DDMMYear) {
        if (DDMMYear == null)
            return null;
        String month[] = { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };
        return  month[Integer.parseInt(DDMMYear.substring(3, 5)) - 1] + ","
                + DDMMYear.substring(6, 10);
    }
    public static void main(String[] args) {
        String year = "2020 ";
        int orgYear = Integer.parseInt(year.trim());
        System.out.println(orgYear-1);


        String date = "01-01-2023";

        System.out.println(date.substring(6,10));

        System.out.println();
    }
}