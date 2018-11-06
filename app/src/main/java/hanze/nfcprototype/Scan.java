package hanze.nfcprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.nfc.NfcAdapter;

public class Scan extends AppCompatActivity {

    private TextView text;
    private NfcAdapter mNfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        text = (TextView) findViewById(R.id.output);

        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);

        // If no NFC adapter is present on the device
        if (mNfcAdapter == null) {
            text.setText("No NFC adapter found!");
            finish();
            return;
        }

        if (!mNfcAdapter.isEnabled()) {
            text.setText("Please turn on NFC");
        }

        handleIntent(getIntent());
    }

    private void handleIntent(Intent intent){

    }
}
