FROM nginx

WORKDIR /usr/share/nginx/html/

COPY --chown=www-data:www-data --chmod=755 . .

COPY entrypoint.sh /usr/local/bin/entrypoint.sh

RUN chmod +x /usr/local/bin/entrypoint.sh

COPY default.conf /etc/nginx/conf.d/default.conf

ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]

CMD ["nginx", "-g", "daemon off;"]
