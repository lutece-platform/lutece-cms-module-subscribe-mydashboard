/*
 * Copyright (c) 2002-2013, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
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
