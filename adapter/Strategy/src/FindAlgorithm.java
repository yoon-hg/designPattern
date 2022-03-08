interface FindAlgorithm {
    public void find(boolean global);
}

class FindMovieAltorithm implements FindAlgorithm {
    public void find(boolean global) {
        System.out.println(
                "find movice" + (global ? "globally" : ""));
    }
}
