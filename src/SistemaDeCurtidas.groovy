public class SistemaCurtidas {

    private Map<Integer, Integer> curtidasPorPostagem;

    public SistemaCurtidas() {
        this.curtidasPorPostagem = new HashMap<>();
    }

    public void curtirPostagem(int idPostagem) {
        curtidasPorPostagem.put(idPostagem, curtidasPorPostagem.getOrDefault(idPostagem, 0) + 1);
    }

    public int getCurtidas(int idPostagem) {
        return curtidasPorPostagem.getOrDefault(idPostagem, 0);
    }
}