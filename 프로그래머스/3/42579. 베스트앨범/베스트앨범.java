import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresPlayCount = new HashMap<>();
        Map<String, List<int[]>> genresSongs = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            genresPlayCount.put(genres[i], genresPlayCount.getOrDefault(genres[i], 0) + plays[i]);

            int[] song = {i, plays[i]};
            List<int[]> songs = genresSongs.getOrDefault(genres[i],new ArrayList<>());
            songs.add(song);
            genresSongs.putIfAbsent(genres[i], songs);
        }

        List<String> sortedGenres = new ArrayList<>(genresPlayCount.keySet());
        sortedGenres.sort((a,b) -> genresPlayCount.get(b) - genresPlayCount.get(a));
        
        List<Integer> bestAlbum = new ArrayList<>();
        
        for (String genre: sortedGenres) {
            List<int[]> songs = genresSongs.get(genre);
            songs.sort((a,b)-> b[1] - a[1]);
            
            bestAlbum.add(songs.get(0)[0]);
            if (songs.size() > 1) {
                bestAlbum.add(songs.get(1)[0]);
            }
        }
        
        return bestAlbum.stream().mapToInt(Integer::intValue).toArray();
    }
}