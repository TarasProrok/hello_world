package prevModules;

public class GooSearchResult {
    private final String url;

    public String getUrl() {
        return url;
    }

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String parseDomain() {
        int slash = url.indexOf("/", 9);
        if (slash > 0) {
            if (url.startsWith("https")) {
                return url.substring(8,url.lastIndexOf("/"));}
 //           if (url.startsWith("http")) {
                return url.substring(7,url.lastIndexOf("/"));}
 //           return null;
        if (slash < 0) {
            if (url.startsWith("https")) {
                return url.substring(8);}
            //           if (url.startsWith("http")) {
            return url.substring(7);}
        return null;
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com./apple").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://robotics.industry.ua/news").parseDomain());
    }
}

