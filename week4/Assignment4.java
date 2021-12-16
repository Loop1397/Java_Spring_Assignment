
public class Assignment4 {

    public static void main(String[] args) {

        long totalCount = 127;
        long pageIndex = 1;

        Pager pager = new Pager(totalCount);
        System.out.println(pager.html(pageIndex));
    }
}