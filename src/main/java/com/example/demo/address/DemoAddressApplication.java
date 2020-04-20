package com.example.demo.address;

import io.dekorate.kubernetes.annotation.ImagePullPolicy;
import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.ServiceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@KubernetesApplication(
        name = "demo-address",
        imagePullPolicy = ImagePullPolicy.IfNotPresent,
        serviceType = ServiceType.ClusterIP
)
public class DemoAddressApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAddressApplication.class, args);
    }

}
