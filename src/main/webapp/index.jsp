
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
  	<webex:Charset mimeType="text/html" />
    <html:base />

    <title><%= request.getAttribute("trackingID")%></title> 
   
  </head>
    <style type="text/css">
      <!--
        body {
	       margin-left: 0px;
	       margin-top: 0px;
	       margin-right: 0px;
	       margin-bottom: 0px;
        }
      -->
</style>
  <body>
  <tr>
    <td>
	<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
      <tr>
         <td>
            <table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
               <tr>
                 <td height="15">
                   <table width="100%"  border="0" cellspacing="0" cellpadding="0" style="margin-top:1px;">
                     <tr>
                       <td height="35" class="TblTitleBgColor" nowrap><webex:localeImg serviceType="MC" src="1x1.gif" height="1" width="1" border="0"/><span class="TblTitleFont"> </span></td>
                      </tr>
                   </table>
                  </td>
                </tr>
                <tr>
                  <td>
                    <table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
                       <tr>
                         <td width="25" rowspan="5" align="left"><webex:localeImg serviceType="MC" src="1x1.gif" height="1" width="1" border="0"/></td>
                         <td height="35"><img src="images/1x1.gif" width="1" height="1"></td>
                         <td width="25" rowspan="5"><webex:localeImg serviceType="MC" src="1x1.gif" height="1" width="1" border="0"/></td>
                       </tr>
                    <tr>
                      <td align="center" valign="middle">
                        <table width="100%"  border="0" cellpadding="0" cellspacing="0">
                         <tr>
                           <td style="font-family:Verdana,Helvetica,Arial,sans-serif;font-size:13px; font-weight:Bold; text-align:center; " nowrap>(<%=request.getAttribute("trackingID")%>) </td>
                         </tr>
                         <tr>
                           <td>&nbsp;</td>
                         </tr>
                         <tr>
                           <td style="text-align:center; ">&nbsp;</td>
                         </tr>
                        </table>
                       </td>
                     </tr>
                     <tr>
                       <td align="center" valign="middle">&nbsp;</td>
                     </tr>
                      <tr>
                        <td height="198" align="center" valign="bottom">
                          <table width="100%"  border="0" cellspacing="0" cellpadding="0">

                           </table>
                        </td>
                       </tr>
                   </table></td>          </tr>
        </table>
		</td>
      </tr>
    </table></td>
  </tr>
</table>
  <html:errors/>
    
  </body>
</html:html>
