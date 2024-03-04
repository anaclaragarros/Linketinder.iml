class SistemaCurtidas {

    private Map<Integer, Integer> mapaCurtidas = [:]

    void curtirPostagem(int idPostagem) {
        if (mapaCurtidas.containsKey(idPostagem)) {
            mapaCurtidas.put(idPostagem, mapaCurtidas.get(idPostagem) + 1)
        } else {
            mapaCurtidas.put(idPostagem, 1)
        }
    }

    int obterCurtidas(int idPostagem) {
        return mapaCurtidas.getOrDefault(idPostagem, 0)
    }
}
