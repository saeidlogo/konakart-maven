package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - SendTemplateEmailToCustomer1 - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class SendTemplateEmailToCustomer1
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public SendTemplateEmailToCustomer1(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public EmailIf sendTemplateEmailToCustomer1(int customerId, String message, EmailOptionsIf options) throws KKException
     {
         return kkEng.sendTemplateEmailToCustomer1(customerId, message, options);
     }
}
