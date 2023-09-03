package stream.beatifier;

public class PoemBeautifier {


    public void addABC (String poem,PoemDecorator poemDecorator){
        System.out.println("ABC: " + poemDecorator.text(poem));
    }

    public void poemToUpperCase (String poem,PoemDecorator poemDecorator){
        String text = poem.toUpperCase();
        System.out.println(text);
    }

    public void poemToLowerCaase (String poem,PoemDecorator poemDecorator){
        String text = poem.toLowerCase();
        System.out.println(text);
    }

    public void poemSubstring (String poem,PoemDecorator poemDecorator){
        String text = poem.substring(1);
        System.out.println(text);
    }

    public void poemClassic (String poem,PoemDecorator poemDecorator){
//        String text = poem;
//        System.out.println(text);
        System.out.println(poemDecorator.text(poem));
    }

}
