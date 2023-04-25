# Setting Up Prometheus and Grafana for a Spring Boot Application

This demo project provides a sample setup for integrating [Prometheus](https://prometheus.io/) and [Grafana](https://grafana.com/) with a Spring Boot application. This is intended to serve as a guide for developers who want to monitor and analyze their Spring Boot applications using these tools.

For more details on how to set up Prometheus and Grafana for your Spring Boot application, please refer to [my blog post](https://medium.com/@moussa.el39/setting-up-prometheus-and-grafana-for-a-spring-boot-application-a94e81d1da12).
## Getting Started

To get started with this demo project, you will need to have the following tools installed:

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

Once you have these tools installed, follow these steps to run the demo:

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Run the spring boot app
4. Navigate to docker directory, then run the following command to start Prometheus and Grafana:
    ```bash
    docker-compose up
    ```
5. Once the containers are up and running, you can access the following services:
   * Prometheus: http://localhost:9090/
   * Grafana: http://localhost:3000/
6. To access Grafana, use the following credentials:
   * Username: admin
   * Password: admin
7. In Grafana, you can create a new dashboard and add a Prometheus data source. From there, you can start creating visualizations and alerts based on your application's metrics.
## Contributing
   If you would like to contribute to this demo project, feel free to submit a pull request. We welcome contributions from the community!