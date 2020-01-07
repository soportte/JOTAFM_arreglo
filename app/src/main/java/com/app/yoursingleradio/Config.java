package com.app.yoursingleradio;

public class Config {

    //if admin panel disabled, put your radio stream url here
    public static final String RADIO_STREAM_URL = "http://miradioenlaweb.com:4298";

    //set true to enable admin panel or set false to disable
    public static final boolean ENABLE_ADMIN_PANEL = false;
    //if admin panel enabled, put your admin panel url here
    public static final String ADMIN_PANEL_URL = "http://10.0.2.2/your_single_radio";

    //ads configuration
    public static final boolean ENABLE_ADMOB_BANNER_ADS = false;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ADS_ON_LOAD = false;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ADS_ON_DRAWER_SELECTION = false;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ON_PLAY = false;
    public static final int ADMOB_INTERSTITIAL_ON_PLAY_INTERVAL = 3;

    //auto play function
    public static final boolean ENABLE_AUTO_PLAY = true;

    //layout customization
    public static final boolean ENABLE_SOCIAL_MENU = true;

    //album art configuration
    public static final boolean ENABLE_ALBUM_ART = true;
    public static final boolean ENABLE_CIRCULAR_IMAGE_ALBUM_ART = true;
    public static final int ALBUM_ART_BORDER_WIDTH = 8;
    public static final int ALBUM_ART_CORNER_RADIUS = 30;

    //when it enabled, the radio will be reloaded and the metadata will immediately be updated
    //there may be a slight delay on play audio streaming when the metadata is updated
    public static final boolean FORCE_UPDATE_METADATA_ON_RESUME = true;

    //splash screen duration in millisecond
    public static final int SPLASH_SCREEN_DURATION = 3000;

}