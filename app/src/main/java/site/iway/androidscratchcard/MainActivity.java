package site.iway.androidscratchcard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import site.iway.androidhelpers.AssetsHelper;
import site.iway.androidhelpers.ScratchCard;
import site.iway.androidhelpers.ScratchCard.OnScratchListener;

public class MainActivity extends Activity {

    private ImageView mContentView;
    private ScratchCard mScratchCard;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContentView = (ImageView) findViewById(R.id.contentView);
        mContentView.setImageBitmap(AssetsHelper.readImageFile(this, "image.jpg"));
        mScratchCard = (ScratchCard) findViewById(R.id.scratchCard);
        mScratchCard.setOnScratchListener(new OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.66) {
                    Toast.makeText(MainActivity.this, "Content Visible", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
