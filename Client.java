package clientname;

public class Client
{
    private static final Client INSTANCE = new Client();
    public static final Client getInstance()
    {
        return INSTANCE;
    }

    private DiscordRP discordRP = new DiscordRP();

    public void init()
    {
        discordRP.start(); // INIT for discordRP
    }

    public void shutdown()
    {
        discordRP.shutdown(); // shut down for discordRP
    }

    public DiscordRP getDiscordRP()
    {
        return discordRP; // returning DiscordRP
    }
}
