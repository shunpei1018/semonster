public class Main {
    public static void main(String[] args) {
        // mainブランチのタイトルと、新しいメッセージを採用
        System.out.println("SEMONSTER GAME");
        System.out.println("Show draw monsters!");

        // playerブランチ（HEAD）の、複数のモンスターを描画するロジックを採用
        Player player = new Player();
        player.drawMonsters();
        player.showDeck();
    }
}