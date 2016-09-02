package com.huangxiao.activitytest;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is"+getTaskId());
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
//                Toast.makeText(FirstActivity.this, "You clicked Button 1",Toast.LENGTH_SHORT).show();
//                finish();
//                Intent intent=new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                Intent intent=new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent);
//                String data="Hello SecondActivity";

//                intent.putExtra("extra_data",data);
//                startActivityForResult(intent,1);
            }
        });
    }
//    @Override
//    protected void onActivityResult(int requestCode,int resultCode,Intent data){
//        switch (requestCode){
//            case 1:
//                if(resultCode==RESULT_OK){
//                    String returnedData=data.getStringExtra("data_return");
//                    Log.d("FirstActivity",returnedData);
//                }
//                break;
//            default:
//        }
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("FirstActivity","onRestart");
    }

}
