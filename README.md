# countries-api
🇦🇶 🏳 🇦🇷 🇧🇳 🇨🇲 🇪🇪 🇬🇬 🇭🇺 🇰🇭 🇱🇻 🇲🇺 🇴🇲 🇷🇸 🇸🇸 🇹🇷 🏴󠁧󠁢󠁷󠁬󠁳󠁿 🇼🇫 🇸🇹 🇷🇺 🇵🇦 🇲🇻 🇱🇾 🇰🇮 🇮🇨 🇬🇭 🇪🇬 🇨🇳 🇧🇴 🇦🇸 🏴 🏁 🇦🇹 🇧🇶 🇨🇴 🇪🇭 🇬🇮 🇮🇩 🇰🇲 🇲🇦 🇲🇼 🇵🇪 🇷🇼 🇸🇻 🇹🇻 🇼🇸 🇽🇰 🇹🇼 🇸🇦 🇸🇽 🇵🇫 🇲🇽 🇲🇨 🇰🇳 🇮🇪 🇬🇱 🇪🇷 🇨🇷 🇧🇷 🇦🇺 🚩 🎌 🇦🇼 🇧🇸 🇨🇺 🇪🇸 🇨🇺 🇧🇸 🇦🇼 🎌 🏴‍☠️ 🇦🇽 🇧🇹 🇨🇻 🇪🇹 🇬🇳 🇮🇲 🇰🇷 🇲🇪 🇲🇿 🇵🇭 🇸🇧 🇸🇿 🇺🇦 🇾🇹 🇿🇦 🇺🇬 🇹🇦 🇸🇨 🇵🇰 🇳🇦 🇲🇬 🇰🇼 🇮🇳 🇬🇵 🇪🇺 🇨🇼 🇦🇿 🇧🇦 🇨🇽 🇫🇮 🇬🇾 🇲🇶 🇱🇮 🇳🇱 🇸🇲 🇹🇰 🇲🇵 🇭🇷 🇭🇰 🇯🇵 🇬🇾 🇯🇲 🇱🇨 🇬🇼 🇬🇧 🇯🇵 🇷🇴 🇸🇲 🇻🇳 🇹🇴 🇸🇰 🇹🇰🏴󠁧󠁢󠁷󠁬󠁳󠁿 🇼🇸  🇷🇴 🇦🇲 🇧🇭 🇨🇩 🇨🇿 🇫🇮 🇬🇳 🇧🇧 🇧🇩 🇧🇪 🇧🇿 🇨🇺 🇻🇬 🇱🇮 🇲🇰 🇬🇮 🇬🇭 🇭🇷


This project has an architecture based on microservices. This api has different layers: 

- Domain layer.
- Persistence layer.
- Service layer.
- Rest layer.  

To run the project you can clone this repository and run the following commands in the terminal.  

 - ./gradle build : generate the build / libs folder with the project's JAR
 - ./gradle run : run the project
 - ./gradle test : run all tests
 
 #### EndPoints: countries 

--- 

    Find by id country : GET

 http://localhost:8000/api/v1.0/countries/ID

    Find all dog countries : GET

http://localhost:8000/api/v1.0/countries/ 


