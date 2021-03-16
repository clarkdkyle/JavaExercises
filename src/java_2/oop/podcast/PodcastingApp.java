package java_2.oop.podcast;

import java.util.List;

class PodcastingApp {

/*
	   Properties :
	   - appName (Apple Podcasts, Pocket Casts, Overcast, Google Podcasts, etc.)
       - playlist of Podcasts (with a capital P)

       Methods :
       - loadPlaylist (replace the existing playlist with a new one)
       - addPodcast (add a new podcast to the playlist.  order of the playlist should be maintained.
       - play()
       - stop()
       - next()
       - previous()
       - repeat()
       - showPlaylist()
       - removeFromPlaylist(Podcast)
*/
    String appName;
    List<Podcast> playlist;


    public PodcastingApp(String appName, List<Podcast> playlist) {
        this.appName = appName;
        this.playlist= playlist;



    }
}

