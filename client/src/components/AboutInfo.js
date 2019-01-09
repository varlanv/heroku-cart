import React, {Component} from 'react';

class AboutInfo extends Component {
    constructor(props) {
        super(props)

    }

    state = {};

    render() {
        return (
            <div id="about">
                <p>
                    This project i dedicated to learn following technologies and concepts:
                    <ul>
                        <li>
                            Spring security
                        </li>
                        <li>
                            ReactJS
                        </li>
                        <li>
                            Integrating backend with single-page front end
                        </li>
                        <li>
                            REST API
                        </li>
                    </ul>
                </p>
<br/>
                <p>
                    Full list of farmeworks and technologies used:
                    <ul>
                        <li>
                            Spring boot
                        </li>
                        <li>
                            Spring mvc
                        </li>
                        <li>
                            Spring data
                        </li>
                        <li>
                            Spring security
                        </li>
                        <li>
                            ReactJS
                        </li>
                        <li>
                            AJAX
                        </li>
                    </ul>
                </p>
                Source code can be found at <a href="https://github.com/varlanv/heroku-shop">https://github.com/varlanv/heroku-shop</a>
            </div>
        )
    }
}

export default AboutInfo;