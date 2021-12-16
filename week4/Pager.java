
public class Pager {

    // 페이지네비게이션에서 보여주는 블럭 수
    private long pageBlock = 10;
    // 전체 게시글 수
    private long totalCount;
    // 현재 페이지번호
    private long pageIndex;
    // 한 페이지에서 보여주는 블럭 수
    private final static long PAGE_ON_BLOCK = 10;

    StringBuffer pageNavigation = new StringBuffer();

    public Pager(long totalCount) {
        this.totalCount = totalCount;
    }

    public String html(long pageIndex) {
        this.pageIndex = pageIndex;

        // 현재 블럭
        int currentBlock = (int) pageIndex / PAGE_ON_BLOCK;
        // 마지막 블럭
    }
}
