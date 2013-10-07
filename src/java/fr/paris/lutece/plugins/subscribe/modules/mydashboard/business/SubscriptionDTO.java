package fr.paris.lutece.plugins.subscribe.modules.mydashboard.business;

/**
 * DTO to display subscription to users
 */
public class SubscriptionDTO
{
    private int _nIdSubscription;
    private String _strHtmlSubscription;
    private boolean _bRemovable;
    private String _strUrlModify;

    /**
     * Get the id of the subscription described by this DTO
     * @return The id of the subscription described by this DTO
     */
    public int getIdSubscription( )
    {
        return _nIdSubscription;
    }

    /**
     * Set the id of the subscription described by this DTO
     * @param nIdSubscription The id of the subscription described by this DTO
     */
    public void setIdSubscription( int nIdSubscription )
    {
        this._nIdSubscription = nIdSubscription;
    }

    /**
     * Get the HTML description of the subscription
     * @return The HTML description of the subscription
     */
    public String getHtmlSubscription( )
    {
        return _strHtmlSubscription;
    }

    /**
     * Set the HTML description of the subscription
     * @param strHtmlSubscription The HTML description of the subscription
     */
    public void setHtmlSubscription( String strHtmlSubscription )
    {
        this._strHtmlSubscription = strHtmlSubscription;
    }

    /**
     * Check if the subscription is removable
     * @return True if the subscription is removable, false otherwise
     */
    public boolean getRemovable( )
    {
        return _bRemovable;
    }

    /**
     * Set the subscription removable
     * @param bRemovable True if the subscription is removable, false otherwise
     */
    public void setRemovable( boolean bRemovable )
    {
        this._bRemovable = bRemovable;
    }

    /**
     * Get the URL to modify
     * @return The URL to modify the subscription
     */
    public String getUrlModify( )
    {
        return _strUrlModify;
    }

    /**
     * Set the URL to modify
     * @param strUrlModify The URL to modify the subscription
     */
    public void setUrlModify( String strUrlModify )
    {
        this._strUrlModify = strUrlModify;
    }
}
