package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Buyers.ConfirmFinalOrderActivity;

public class PaymentActivity extends AppCompatActivity
{
    private Button paymentProceed;
    EditText cardNumber, cardValidityMonth, cardValidityYear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        paymentProceed = findViewById(R.id.payment_proceede_btn);
        cardNumber =findViewById(R.id.creditCard_number_editText);
        cardValidityMonth = findViewById(R.id.month_editText);
        cardValidityYear = findViewById(R.id.year_editText);


        paymentProceed.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String cardNo =  cardNumber.getText().toString();
                String cardMonth = cardValidityMonth.getText().toString();
                String cardYear = cardValidityYear.getText().toString();

                if(TextUtils.isEmpty(cardNo) && TextUtils.isEmpty(cardMonth) && TextUtils.isEmpty(cardYear))
                {
                    Toast.makeText(PaymentActivity.this, "Please fill the all data", Toast.LENGTH_SHORT).show();


                }
                else
                {
                    Intent intent = new Intent(PaymentActivity.this, ConfirmFinalOrderActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}