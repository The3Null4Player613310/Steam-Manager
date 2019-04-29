public class AccountManager
{
    private String name,password,apikey;
    public TradeManager tradeManager;
    public IdleManager idleManager;
    public TimeManager timeManager;
    public FriendsManager friendsManager;
    public InventoryManager inventoryManager;
    public StockManager stockManager;
    public LibraryManager libraryManager;

    public AccountManager(String inName, String inPassword, String inApikey)
    {
        name = inName;
        password = inPassword;
        apikey = inApikey;
    }

    public boolean login()
    {
        return false;
    }

    public boolean logout()
    {
        return false;
    }
}
