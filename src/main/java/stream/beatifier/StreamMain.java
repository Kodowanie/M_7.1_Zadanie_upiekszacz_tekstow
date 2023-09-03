package stream.beatifier;

public class StreamMain {
    public static void main(String[] args) {

       PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.addABC("peom",(poem) -> (poem));
        poemBeautifier.poemToUpperCase("peom",(poem) -> (poem));
        poemBeautifier.poemToLowerCaase("POEM",(poem) -> (poem));
        poemBeautifier.poemSubstring("poem",(poem) -> (poem));





    }
}