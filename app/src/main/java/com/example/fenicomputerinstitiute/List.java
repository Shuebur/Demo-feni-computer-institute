package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class List extends AppCompatActivity {
private Button blood,ICt,Bdclean,Rover,Cultural;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Activiteis List");

        blood=findViewById(R.id.blood_id);
        ICt=findViewById(R.id.Ict_id);
        Bdclean=findViewById(R.id.Bdclean_id);
        Rover=findViewById(R.id.Roverscout_id);
        Cultural=findViewById(R.id.Cultural_id);
        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/276937702648922/about/"));
                startActivity(intent);
            }
        });
        ICt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/2022144844773530/"));
                startActivity(intent);
            }
        });
        Bdclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/2022144844773530/"));
                startActivity(intent);
            }
        });
       Rover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Rover-scouts-Of-FCI-1442958059351986/?__tn__=kC-R&eid=ARAacnFbuHUjPoxEddIEOqxsLVNCDSRhfaDNoBUuWGww_xrn17o3LhzjlV-fW7kLT_z_V0VXGEP3A-EI&hc_ref=ARTfePlhTgPeXERDlxVdAd2ZnfjLGErF87OUbRRPo1qbaHlEC19ttlJzl4Gfsxmldsk&fref=tag&__xts__[0]=68.ARBb9lBnW1OZLWCUdxakCazFJ2WHcFMLPx53l2fsMdj2f8jxBcSg8NZGeH2BeR43Xe0aBk2wVUfqKswUU-RvuXgHDN7UAsDO5Hn_fQdidmLqIS2hA_9G08DI_YOkx7Us4P8zDUzU_3GFVCWzobTevNqHRyl-hdcNAYWwqS9HuclTHlM75zjtlh2lEY3Iurk3_F9dynTr2e3B8KDgAWBwnFFJiO8EKV3pfuNpoYl35uRQMQJPR8wFdmUAOHBBvRnDJuYgvsOvtOnnVVpU5L8O0HZmACTs1tTMPb_C"));
                startActivity(intent);
            }
        });
        Cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/FCICulturalClub/"));
                startActivity(intent);
            }
        });
    }
}
