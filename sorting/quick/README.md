# Blog Notes: Quick Sort

## Part 1

The following functions sort domain objects. The functions here receive an array of Movie objects. Each Movie object has a title (string), a year (number), and a list of genres (array of strings). One function will sort the movies by most recent year first. One function will sort the movies, alphabetical by title, but will ignore any leading “A”s, “An”s, or “The”s


### Code

```
class Movie {
    private String title;
    private int year;
    private String[] genres;

    public Movie(String title, int year, String[] genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String[] genres(){
        return genres;
    }

}

public class MovieSorting {
    public static void sortByYear(Movie[] movies) {
        Arrays.sort(movies, Comparator.comparingInt(Movie::getYear).reversed());
    }

    public static void sortByTitleIgnoringArticles(Movie[] movies) {
        Arrays.sort(movies, Comparator.comparing(Movie::getTitle, (s1, s2) -> {
            s1 = s1.replaceFirst("^(?i)(a|an|the)\\s", "");
            s2 = s2.replaceFirst("^(?i)(a|an|the)\\s", "");
            return s1.compareToIgnoreCase(s2);
        }));
    }

    // Test methods
    public static void testSortByYear() {
        Movie[] movies = {
            new Movie("Movie 1", 2003, new String[]{"Genre 1", "Genre 2"}),
            new Movie("Movie 2", 2013, new String[]{"Genre 3", "Genre 4"}),
            new Movie("Movie 3", 2023, new String[]{"Genre 5", "Genre 6"})
        };

        sortByYear(movies);

        // Assertion
        assert movies[0].getYear() == 2023;
        assert movies[1].getYear() == 2013;
        assert movies[2].getYear() == 2003;
    }

    public static void testSortByTitleIgnoringArticles() {
        Movie[] movies = {
            new Movie("The Movie", 2003, new String[]{"Genre 1", "Genre 2"}),
            new Movie("An Amazing Movie", 2013, new String[]{"Genre 3", "Genre 4"}),
            new Movie("A Movie", 2023, new String[]{"Genre 5", "Genre 6"})
        };

        sortByTitleIgnoringArticles(movies);

        // Assertion
        assert movies[0].getTitle().equals("An Amazing Movie");
        assert movies[1].getTitle().equals("A Movie");
        assert movies[2].getTitle().equals("The Movie");
    }

    public static void main(String[] args) {
        // Run the tests
        testSortByYear();
        testSortByTitleIgnoringArticles();

        System.out.println("All tests passed!");
    }
}


```
