package ch15.Sample.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

class Database { // 이 패키지 안에서만 사용(package visibility)
    private Database() {
    }

    // 데이터베이스 이름에서 Properties를 얻는다 
    public static Properties getProperties(String dbname) throws IOException {
        String filename = dbname + ".txt";

        Properties prop = new Properties();

        prop.load(new FileReader(filename));

        return prop;
    }
}
