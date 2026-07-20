# works for Amazon AMIs - t3.micro

# for Blue TG
#!/bin/bash
sudo yum install -y httpd 
sudo yum install -y unzip
sudo yum install -y curl
sudo cd /tmp
sudo curl -L -o villa.zip https://templatemo.com/download/templatemo_591_villa_agency
sudo unzip -o villa.zip
sudo rm -rf /var/www/html/*
sudo cp -r templatemo_591_villa_agency/* /var/www/html
sudo systemctl enable httpd
sudo systemctl restart httpd

# for Green TG
#!/bin/bash
sudo yum install -y httpd 
sudo yum install -y unzip 
sudo yum install -y curl
sudo cd /tmp
sudo curl -L -o cafe.zip https://templatemo.com/download/templatemo_558_klassy_cafe
sudo unzip -o cafe.zip
sudo rm -rf /var/www/html/*
sudo cp -r templatemo_558_klassy_cafe/* /var/www/html
sudo systemctl enable httpd
sudo systemctl restart httpd


