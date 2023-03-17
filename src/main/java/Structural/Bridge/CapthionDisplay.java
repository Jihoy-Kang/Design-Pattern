package Structural.Bridge;

public class CapthionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("title : " + draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("author : " + draft.getAuthor());

    }

    @Override
    public void content(Draft draft) {
        System.out.println("content : ");
        for(String content : draft.getContent()){
            System.out.println("     " + content);
        }
    }
}
