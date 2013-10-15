package fr.paris.lutece.plugins.subscribe.modules.mydashboard.service;

import fr.paris.lutece.plugins.mydashboard.service.MyDashboardComponent;
import fr.paris.lutece.plugins.subscribe.business.Subscription;
import fr.paris.lutece.plugins.subscribe.business.SubscriptionFilter;
import fr.paris.lutece.plugins.subscribe.modules.mydashboard.business.SubscriptionDTO;
import fr.paris.lutece.plugins.subscribe.service.ISubscriptionProviderService;
import fr.paris.lutece.plugins.subscribe.service.SubscriptionService;
import fr.paris.lutece.portal.service.i18n.I18nService;
import fr.paris.lutece.portal.service.security.LuteceUser;
import fr.paris.lutece.portal.service.security.SecurityService;
import fr.paris.lutece.portal.service.template.AppTemplateService;
import fr.paris.lutece.util.html.HtmlTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;


/**
 * Dashboard component to display subscriptions of the current user
 */
public class MyDashboardComponentSubscription extends MyDashboardComponent
{
    private static final String DASHBOARD_COMPONENT_ID = "subscribe.mydashboardComponentSubscription";

    private static final String MESSAGE_COMPONENT_DESCRIPTION = "module.subscribe.mydashboard.mydashboardComponentSubscription.description";

    private static final String MARK_LIST_SUBSCRIPTION_DTO = "list_subscription_dto";

    private static final String TEMPLATE_DASHBOARD_SUBSCRIPTION = "skin/plugins/subscribe/modules/mydashboard/dashboardcomponent/dashboardComponentSubscription.html";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDashboardData( HttpServletRequest request )
    {
        if ( SecurityService.isAuthenticationEnable( ) )
        {
            LuteceUser user = SecurityService.getInstance( ).getRegisteredUser( request );
            if ( user != null )
            {
                SubscriptionService subscriptionService = SubscriptionService.getInstance( );
                SubscriptionFilter filter = new SubscriptionFilter( );
                filter.setIdSubscriber( user.getName( ) );
                List<Subscription> listSubscription = subscriptionService.findByFilter( filter );
                List<SubscriptionDTO> listSubscriptionDto = new ArrayList<SubscriptionDTO>( listSubscription.size( ) );
                for ( Subscription subscription : listSubscription )
                {
                    ISubscriptionProviderService providerService = subscriptionService.getProviderService( subscription
                            .getSubscriptionProvider( ) );
                    SubscriptionDTO subscriptionDTO = new SubscriptionDTO( );
                    subscriptionDTO.setIdSubscription( subscription.getIdSubscription( ) );
                    subscriptionDTO.setRemovable( providerService.isSubscriptionRemovable( user,
                            subscription.getSubscriptionKey( ), subscription.getIdSubscribedResource( ) ) );
                    subscriptionDTO.setUrlModify( providerService.getUrlModifySubscription( user,
                            subscription.getSubscriptionKey( ), subscription.getIdSubscribedResource( ) ) );
                    subscriptionDTO.setHtmlSubscription( providerService.getSubscriptionHtmlDescription( user,
                            subscription.getSubscriptionKey( ), subscription.getIdSubscribedResource( ),
                            request.getLocale( ) ) );
                    listSubscriptionDto.add( subscriptionDTO );
                }

                Map<String, Object> model = new HashMap<String, Object>( );
                model.put( MARK_LIST_SUBSCRIPTION_DTO, listSubscriptionDto );

                HtmlTemplate template = AppTemplateService.getTemplate( TEMPLATE_DASHBOARD_SUBSCRIPTION,
                        request.getLocale( ), model );

                return template.getHtml( );
            }
        }
        return StringUtils.EMPTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getComponentId( )
    {
        return DASHBOARD_COMPONENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getComponentDescription( Locale locale )
    {
        return I18nService.getLocalizedString( MESSAGE_COMPONENT_DESCRIPTION, locale );
    }

}
