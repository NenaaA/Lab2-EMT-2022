import axios from "axios";

const AXIOS = axios.create({
    baseUrl: "http://localhost:9091",
    headers: {
        'Access-Control-Allow-Origin' : "*"
    }
})

export default AXIOS;