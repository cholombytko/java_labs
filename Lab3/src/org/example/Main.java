package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed aliquam magna.\n" +
                "Proin hendrerit, sapien in feugiat ullamcorper, ex quam commodo lacus, eu euismod orci libero egestas magna.\n" +
                "Integer vulputate tellus diam, eget consectetur lacus venenatis eu.\n" +
                "Cras vel enim mi. Praesent tincidunt euismod scelerisque.\n" +
                "Donec efficitur augue velit, vel congue enim molestie in.\n" +
                "Ut non nunc eget nibh sodales vestibulum eu sed orci.\n" +
                "Sed tincidunt metus ac massa vulputate luctus?\n" +
                "Sed fringilla lacus ultrices urna pulvinar pellentesque.\n" +
                "Nunc venenatis turpis in enim porta gravida.\n" +
                "Aliquam faucibus tortor erat, sit amet ultrices nulla faucibus ut?\n" +
                "Curabitur non purus non felis posuere blandit non nec massa.\n" +
                "Curabitur est sem, placerat id nisl in, porta facilisis tortor.\n" +
                "Nullam nunc libero, molestie a tortor a, pretium dictum massa.";

        WordSearch.INSTANCE.displayWords(3, text);
    }
}
