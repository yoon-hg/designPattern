public interface SearchStrategy {
    public void search();
}

class SearchStrategyAll implements SearchStrategy {
    public void search() {
        System.out.println("Search All");
    }
}

class SearchStrategyImage implements SearchStrategy {
    public void search() {
        System.out.println("Search Image");
    }
}

class SearchStrategyNews implements SearchStrategy {
    public void search() {
        System.out.println("Search News");
    }
}

class SearchStrategyMap implements SearchStrategy {
    public void search() {
        System.out.println("Search Map");
    }
}

/*
 * searchFindAdapter를 사용해 SearchStragtegy를 implemnts를 하여
 * 안에 내용으로는 생성자로 우리가 붙힐 새로운 인터페이스 FindAlgorithm을 받아
 * search 안에 FindAlgorithm의 find를 실행 시켜 잘 동작하도록 한다.
 */
class SearchFindAdapter implements SearchStrategy {
    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter(FindAlgorithm _findAlgorithm) {
        findAlgorithm = _findAlgorithm;
    }

    public void search() {
        findAlgorithm.find(true);
    }
}