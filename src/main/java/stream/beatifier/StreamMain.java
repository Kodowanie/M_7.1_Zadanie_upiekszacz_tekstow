package stream.beatifier;

public class StreamMain {
    public static void main(String[] args) {

       PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.addABC("peom",(poem) -> (poem));
        poemBeautifier.poemToUpperCase("peom",(poem) -> (poem));
        poemBeautifier.poemToLowerCaase("POEM",(poem) -> (poem));
        poemBeautifier.poemSubstring("poem",(poem) -> (poem));


        //2 rozwiazanie
        poemBeautifier.poemClassic("poem!", (poem) ->
        {
            String text = "ABC!: " + poem;
            return (text);
        });
        poemBeautifier.poemClassic("poem!", (poem) ->
        {
            String text = poem.toUpperCase();
            return (text);
        });
        poemBeautifier.poemClassic("POEM!", (poem) ->
        {
            String text = poem.toLowerCase();
            return (text);
        });
        poemBeautifier.poemClassic("poem!", (poem) ->
        {
            String text = poem.substring(1);
            return (text);
        });




    }
}