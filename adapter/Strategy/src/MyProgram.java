public class MyProgram {

    private SearchButton searchButton = new SearchButton();

    public void setModeAll() {
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }

    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }

    public void setModeNews() {
        searchButton.setSearchStrategy(new SearchStrategyNews());
    }

    public void setModeMap() {
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }

    public void setModeMovie() {
        searchButton.setSearchStrategy(new SearchFindAdapter(new FindMovieAltorithm()));
    }

    public void testProgram() {
        searchButton.onClick();
        setModeImage();
        searchButton.onClick();
        setModeNews();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
        setModeMovie();
        searchButton.onClick();
    }
}
