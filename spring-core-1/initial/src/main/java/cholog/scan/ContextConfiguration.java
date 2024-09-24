package cholog.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
ComponentScan에 대해 학습하고, ComponenetScanBean을 Bean으로 등록하기
 */
@ComponentScan
public class ContextConfiguration {
    private ComponentScanBean componentScanBean;

    @Autowired
    public void setComponentScanBean(ComponentScanBean componentScanBean) {
        this.componentScanBean = componentScanBean;
    }
}
