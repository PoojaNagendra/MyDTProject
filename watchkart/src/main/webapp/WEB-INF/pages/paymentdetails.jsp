<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/checkout.css">
<h2 align="center">Payment Details</h2><br/><br/>
    <div class="pay-via">Paying by :<a href="#creditcard">
<button class=" button4">Credit Card</button></a><a href="#netbanking">
<button class=" button2">Net Banking</button></a><a href="#debitcard">
<button class=" button3">Debit Card</button></a><a href="#cod">
<button class=" button5">COD</button></a>
<br/>
<br/>        
</div>
<div class="container">
    <div id="creditcard">
    <div class="row">
        <!-- You can make it whatever width you want. I'm making it full width
             on <= small devices and 4/12 page width on >= medium devices -->
       
        
            <!-- CREDIT CARD FORM STARTS HERE -->
        
            <div class="panel panel-default credit-card-box">
                <div class="panel-heading display-table" >
                    <div class="row display-tr" >
                        <h3 class="panel-title display-td">CREDIT CARD</h3>
                        <div class="display-td" >                            
                            <img class="img-responsive pull-right" src="img/credit%20card.png">
                        </div>
                    </div>                    
                </div>
                <div class="panel-body">
                    <form role="form" id="payment-form" method="POST" action="javascript:void(0);">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label for="cardNumber">CARD NUMBER</label>
                                    <div class="input-group">
                                        <input 
                                            type="tel"
                                            class="form-control"
                                            name="cardNumber"
                                            placeholder="Valid Card Number"
                                            autocomplete="cc-number"
                                            required autofocus 
                                        />
                                        <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                                    </div>
                                </div>                            
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-7 col-md-7">
                                <div class="form-group">
                                    <label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
                                    <input 
                                        type="tel" 
                                        class="form-control" 
                                        name="cardExpiry"
                                        placeholder="MM / YY"
                                        autocomplete="cc-exp"
                                        required 
                                    />
                                </div>
                            </div>
                            <div class="col-xs-5 col-md-5 pull-right">
                                <div class="form-group">
                                    <label for="cardCVC">CV CODE</label>
                                    <input 
                                        type="tel" 
                                        class="form-control"
                                        name="cardCVC"
                                        placeholder="CVC"
                                        autocomplete="cc-csc"
                                        required
                                    />
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label for="couponCode">NAME ON CARD</label>
                                    <input type="text" class="form-control" placeholder="NAME ON CARD" name="couponCode" />
                                </div>
                            </div>                        
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                               <a href="user-success"> <button class="subscribe btn btn-success btn-lg btn-block" type="button">Pay Now!</button></a>
                            </div>
                        </div>
                        <div class="row" style="display:none;">
                            <div class="col-xs-12">
                                <p class="payment-errors"></p>
                            </div>
                        </div>
                    </form>
                </div>
            </div>            
            <!-- CREDIT CARD FORM ENDS HERE -->
         
        </div>            
       </div>
        
</div>
    
    
    
    <div class="container">
        <div id="netbanking">
    <div class="row">
        <!-- You can make it whatever width you want. I'm making it full width
             on <= small devices and 4/12 page width on >= medium devices -->
    <div class="panel panel-default credit-card-box">
                <div class="panel-heading display-table" >
                    <div class="row display-tr" >
                        <h3 class="panel-title display-td">Net Banking</h3>
                        <div class="display-td" >                            
                            <img class="img-responsive pull-right paymentimg" src="img/netbanking.png">
                        </div>
                    </div>                    
                </div>
            
                        
             <div class="pop-bank-logo-wr">
        <div class="pop-bank-wr clearfix">
          

            

                  <div class="net-bnk-logo KOTAK" data-bankcode="KOTAK">
                    <div class="rd-skin KOTAK">&nbsp;</div>
                    <div class="bank-name-wr KOTAK">&nbsp;</div>
                  </div>

           

                  <div class="net-bnk-logo ICICI" data-bankcode="ICICI">
                    <div class="rd-skin ICICI">&nbsp;</div>
                    <div class="bank-name-wr ICICI">&nbsp;</div>
                  </div>

           

                  <div class="net-bnk-logo AXIS" data-bankcode="AXIS">
                    <div class="rd-skin AXIS">&nbsp;</div>
                    <div class="bank-name-wr AXIS">&nbsp;</div>
                  </div>

           

                  <div class="net-bnk-logo SBI" data-bankcode="SBI">
                    <div class="rd-skin SBI">&nbsp;</div>
                    <div class="bank-name-wr SBI">&nbsp;</div>
                  </div>

           

                  <div class="net-bnk-logo CITIBANK" data-bankcode="CITIBANK">
                    <div class="rd-skin CITIBANK">&nbsp;</div>
                    <div class="bank-name-wr CITIBANK">&nbsp;</div>
                  </div>

           

                  <div class="net-bnk-logo HDFC" data-bankcode="HDFC">
                    <div class="rd-skin HDFC">&nbsp;</div>
                    <div class="bank-name-wr HDFC">&nbsp;</div>
                  </div>

           
          
        </div>  
      </div>       
                        
                        <div class="row">
                            <div class="col-xs-12">
                               <a href="user-success"> <button class="subscribe btn btn-success btn-lg btn-block" type="button">Pay Now!</button></a>
                            </div>
                        </div>
                        <div class="row" style="display:none;">
                            <div class="col-xs-12">
                                <p class="payment-errors"></p>
                            </div>
                        </div>
                    </form>
                </div>
            </div>            
            <!-- CREDIT CARD FORM ENDS HERE -->
         
        </div>            
   
    
<div class="container">
    <div id="debitcard">
    <div class="row">
        <!-- You can make it whatever width you want. I'm making it full width
             on <= small devices and 4/12 page width on >= medium devices -->
       
 <!-- CREDIT CARD FORM STARTS HERE -->
        
            <div class="panel panel-default credit-card-box">
                <div class="panel-heading display-table" >
                    <div class="row display-tr" >
                        <h3 class="panel-title display-td">DEBIT CARD</h3>
                        <div class="display-td" >                            
                            <img class="img-responsive pull-right paymentimg" src="img/visa-master.png">
                        </div>
                    </div>                    
                </div>
                <div class="panel-body">
                    <form role="form" id="payment-form" method="POST" action="javascript:void(0);">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label for="cardNumber">CARD NUMBER</label>
                                    <div class="input-group">
                                        <input 
                                            type="tel"
                                            class="form-control"
                                            name="cardNumber"
                                            placeholder="Valid Card Number"
                                            autocomplete="cc-number"
                                            required autofocus 
                                        />
                                        <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                                    </div>
                                </div>                            
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-7 col-md-7">
                                <div class="form-group">
                                    <label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
                                    <input 
                                        type="tel" 
                                        class="form-control" 
                                        name="cardExpiry"
                                        placeholder="MM / YY"
                                        autocomplete="cc-exp"
                                        required 
                                    />
                                </div>
                            </div>
                            <div class="col-xs-5 col-md-5 pull-right">
                                <div class="form-group">
                                    <label for="cardCVC">CV CODE</label>
                                    <input 
                                        type="tel" 
                                        class="form-control"
                                        name="cardCVC"
                                        placeholder="CVC"
                                        autocomplete="cc-csc"
                                        required
                                    />
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label for="couponCode">NAME ON CARD</label>
                                    <input type="text" class="form-control" placeholder="NAME ON CARD" name="couponCode" />
                                </div>
                            </div>                        
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                               <a href="user-success"> <button class="subscribe btn btn-success btn-lg btn-block" type="button">Pay Now!</button></a>
                            </div>
                        </div> 
                        <div class="row" style="display:none;">
                            <div class="col-xs-12">
                                <p class="payment-errors"></p>
                            </div>
                        </div>
                    </form>
                </div>
            </div>            
            <!-- CREDIT CARD FORM ENDS HERE -->
         
        </div>            
       </div>
        
</div>     
    
     
    <div class="container">
        <div id="cod">
    <div class="row">
        <!-- You can make it whatever width you want. I'm making it full width
             on <= small devices and 4/12 page width on >= medium devices -->
    <div class="panel panel-default credit-card-box">
                <div class="panel-heading display-table" >
                    <div class="row display-tr" >
                        <h3 class="panel-title display-td">Cash On Delivery</h3>
                        <div class="display-td" >                            
                            <img class="img-responsive pull-right paymentimg" src="img/cash-on-delivery.png">
                        </div>
                    </div>                    
                </div>
           
                        <br/>
                        <div class="row">
                            <div class="col-xs-12">
                               <a href="user-success">  <button class="subscribe btn btn-success btn-lg btn-block" type="button">Order Now!</button></a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                              <a href="user-landing">  <button   class="subscribe btn btn-warning btn-lg btn-block" type="button">Back</button></a>
                            </div>
                        </div>
                        <div class="row" style="display:none;">
                            <div class="col-xs-12">
                                <p class="payment-errors"></p>
                            </div>
                        </div>
                    </form>
                </div>
            </div>            
            <!-- CREDIT CARD FORM ENDS HERE -->
         
        </div>            
