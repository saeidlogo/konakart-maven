package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetProductNotificationsPerCustomer - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetProductNotificationsPerCustomer
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetProductNotificationsPerCustomer(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public ProductIf[] getProductNotificationsPerCustomer(String sessionId, int languageId) throws KKException
     {
         return kkEng.getProductNotificationsPerCustomer(sessionId, languageId);
     }
}