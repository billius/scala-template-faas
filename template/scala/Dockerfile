FROM openfaas/of-watchdog:0.7.2 as watchdog
FROM hseeberger/scala-sbt


COPY --from=watchdog /fwatchdog /usr/bin/fwatchdog
RUN chmod +x /usr/bin/fwatchdog



# Function
COPY function function/
WORKDIR /root/function/

RUN echo "Copied Sources" && ls

RUN echo "Building with SBT"
RUN sbt clean assembly
COPY function/target/scala-2.12/handler.jar ./
ENV fprocess="java -jar handler.jar"

# Set to true to see request in function logs
ENV write_debug="true"
ENV mode="http"
ENV upstream_url="http://127.0.0.1:8012"

EXPOSE 8080


HEALTHCHECK --interval=5s CMD [ -e /tmp/.lock ] || exit 1
CMD [ "fwatchdog" ]
