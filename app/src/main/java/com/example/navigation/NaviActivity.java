package com.example.navigation;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class NaviActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //    private Toolbar toolbar = null;
    private DrawerLayout drawer = null;
    private ActionBarDrawerToggle toggle = null;
    private NavigationView navigationView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.navigation.R.layout.activity_navi);

        Toolbar toolbar = (Toolbar) findViewById(com.example.navigation.R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(com.example.navigation.R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, com.example.navigation.R.string.navigation_drawer_open, com.example.navigation.R.string.navigation_drawer_close);

        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(com.example.navigation.R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(com.example.navigation.R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case com.example.navigation.R.id.nav_map:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;

            case com.example.navigation.R.id.nav_WebView:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;

            case com.example.navigation.R.id.nav_Setting:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;
            case com.example.navigation.R.id.nav_Youtube:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;
            case com.example.navigation.R.id.nav_Login:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;
            case com.example.navigation.R.id.nav_Camera:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;

            case com.example.navigation.R.id.nav_share:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;

            case com.example.navigation.R.id.nav_send:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;

            case com.example.navigation.R.id.nav_about:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                break;


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(com.example.navigation.R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
