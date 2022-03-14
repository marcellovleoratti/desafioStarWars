CREATE TABLE PLANETAS(
                         id SERIAL PRIMARY KEY NOT NULL,
                         name VARCHAR(99) NOT NULL,
                         rotation_period INTEGER NOT NULL,
                         orbital_period INTEGER NOT NULL,
                         diameter INTEGER NOT NULL,
                         climate INTEGER NOT NULL,
                         gravity VARCHAR(85) NOT NULL,
                         terrain VARCHAR(95) NOT NULL,
                         surface_water INTEGER NOT NULL,
                         population INT NOT NULL,
                         residents varchar(100),
                         films varchar(150)
);
