package Questions.Strings;
public class FindIndexFirstOccurrence {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        FindIndexFirstOccurrence solution = new FindIndexFirstOccurrence();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println("Index: " + solution.strStr(haystack, needle)); 
    }
}
